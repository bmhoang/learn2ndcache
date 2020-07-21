package com.hiheo.jvm.learncache.specification

import com.hiheo.jvm.learncache.domains.Author
import com.hiheo.jvm.learncache.domains.Author_
import org.springframework.data.jpa.domain.Specification

import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.criteria.CriteriaQuery
import javax.persistence.criteria.Predicate
import javax.persistence.criteria.Root

class AuthorSpecification implements Specification<Author> {
  String phone
  @Override
  Predicate toPredicate(Root<Author> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
    return criteriaBuilder & ([
        criteriaBuilder.isMember(phone, root.get(Author_.phones))
    ] as Predicate[])
  }
}
