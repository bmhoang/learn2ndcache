package com.hiheo.jvm.learncache.controllers

import com.hiheo.jvm.learncache.domains.Book
import com.hiheo.jvm.learncache.services.BookService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class BookController {
  @Autowired
  BookService bookService

  @GetMapping(value = '/test')
  Map test() {
    [message: 'Hello World']
  }

  @GetMapping(value = '/books')
  List<Book> findAllBooks() {
    bookService.allBooks()
  }

  @GetMapping(value='/books/{id}')
  Book getBook(@PathVariable Integer id) {
    bookService.getBook(id)
  }
}
