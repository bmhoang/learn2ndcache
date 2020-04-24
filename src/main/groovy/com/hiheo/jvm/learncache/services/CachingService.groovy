package com.hiheo.jvm.learncache.services

import com.hiheo.jvm.learncache.domains.Book
import com.hiheo.jvm.learncache.repository.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cache.CacheManager
import org.springframework.stereotype.Service

import javax.persistence.EntityManager

@Service
class CachingService {
  @Autowired
  BookRepository bookRepository
  @Autowired
  EntityManager entityManager

  void loadAllCache() {
    bookRepository.findAll()
  }

  void evictCache(boolean reload = false) {
    entityManager.entityManagerFactory.cache.evict(Book)
    if (reload) {
      loadAllCache()
    }
    //session.getSessionFactory().getCache().evictQueryRegion( "query.cache.person" );
  }
}
