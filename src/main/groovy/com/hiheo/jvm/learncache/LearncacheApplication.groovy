package com.hiheo.jvm.learncache

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
class LearncacheApplication {

  static void main(String[] args) {
    SpringApplication.run(LearncacheApplication, args)
  }

}
