package com.hiheo.jvm.learncache.services

import com.hiheo.jvm.learncache.domains.Book
import com.hiheo.jvm.learncache.repository.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BookService {
  @Autowired
  BookRepository bookRepository

  List<Book> allBooks() {
    bookRepository.findAll()
  }

  Book getBook(Integer id) {
    bookRepository.findById(id).orElse(null)
  }
}
