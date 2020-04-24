package com.hiheo.jvm.learncache.controllers

import com.hiheo.jvm.learncache.services.CachingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CacheController {
  @Autowired
  CachingService cachingService

  @GetMapping(value = '/evict')
  Map test() {
    cachingService.evictCache(false)
    [message: 'OK']
  }

}
