package com.hiheo.jvm.learncache.domains

import javax.persistence.Column
import javax.persistence.ElementCollection
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = 'author')
class Author {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id

  String name

  @Column(name = 'phones')
  @ElementCollection
  List<String> phones
}
