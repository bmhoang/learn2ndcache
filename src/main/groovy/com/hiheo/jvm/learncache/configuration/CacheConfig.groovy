package com.hiheo.jvm.learncache.configuration

import org.springframework.cache.CacheManager
import org.springframework.cache.annotation.EnableCaching
import org.springframework.cache.ehcache.EhCacheCacheManager
import org.springframework.cache.ehcache.EhCacheFactoryBean
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.io.ClassPathResource

@Configuration
@EnableCaching
class CacheConfig {
  @Bean
  public EhCacheManagerFactoryBean ehCacheManagerFactoryBean() {
    new EhCacheManagerFactoryBean(configLocation: new ClassPathResource("/ehcache.xml", getClass()))
  }

  @Bean
  public CacheManager cacheManager() {
    new EhCacheCacheManager(cacheManager: ehCacheManagerFactoryBean().object)
  }

  @Bean
  public EhCacheFactoryBean ehCacheFactory() {
    new EhCacheFactoryBean(cacheManager: ehCacheManagerFactoryBean().object,
        bootstrapCacheLoader: myBootstrapCacheLoaderFactory())
  }

  @Bean
  public MyBootstrapCacheLoaderFactory myBootstrapCacheLoaderFactory() {
    new MyBootstrapCacheLoaderFactory()
  }
}
