package com.hiheo.jvm.learncache.domains

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = 'book')
class Book {
  @Id
  @GeneratedValue
  Integer id

  String firstName
  String lastName
  String career
}
