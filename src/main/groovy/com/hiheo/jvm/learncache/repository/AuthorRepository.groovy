package com.hiheo.jvm.learncache.repository

import com.hiheo.jvm.learncache.domains.Author
import org.springframework.data.jpa.domain.Specification
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AuthorRepository extends JpaRepository<Author, Long> {
  List<Author> findAll(Specification specification)
}