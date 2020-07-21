package com.hiheo.jvm.learncache.controllers

import com.hiheo.jvm.learncache.domains.Author
import com.hiheo.jvm.learncache.services.AuthorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthorController {
  @Autowired
  AuthorService authorService

  @GetMapping('/author')
  List<Author> findAuthorByPhone(@RequestParam(name = 'phone', required = false) String phone) {
    authorService.findAuthorsByPhone(phone ?: '---')
  }

  @GetMapping('/author/{id}')
  Author getAuthor(@PathVariable(name = 'id') Long id) {
    authorService.getAuthor(id)
  }
}
