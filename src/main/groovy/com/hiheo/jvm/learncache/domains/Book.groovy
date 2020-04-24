package com.hiheo.jvm.learncache.domains

import org.hibernate.annotations.Cache
import org.hibernate.annotations.CacheConcurrencyStrategy

import javax.persistence.Cacheable
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = 'book')
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY, region = 'bookregion')
class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id

  String firstName
  String lastName
  String career
}
