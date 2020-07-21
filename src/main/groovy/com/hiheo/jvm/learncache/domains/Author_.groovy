package com.hiheo.jvm.learncache.domains

import javax.persistence.metamodel.ListAttribute
import javax.persistence.metamodel.StaticMetamodel

@StaticMetamodel(Author)
abstract class Author_ {
  public static volatile ListAttribute<Author, String> phones;
}
