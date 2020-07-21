package com.hiheo.jvm.learncache.services

import com.hiheo.jvm.learncache.domains.Author
import com.hiheo.jvm.learncache.repository.AuthorRepository
import com.hiheo.jvm.learncache.specification.AuthorSpecification
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AuthorService {
  @Autowired
  AuthorRepository authorRepository

  List<Author> findAuthorsByPhone(String phone) {
    def specification = new AuthorSpecification(phone: phone)
    authorRepository.findAll(specification)
  }

  Author getAuthor(Long id) {
    authorRepository.findById(id).orElse(null)
  }
}
