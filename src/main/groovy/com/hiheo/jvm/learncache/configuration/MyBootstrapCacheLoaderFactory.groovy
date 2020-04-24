package com.hiheo.jvm.learncache.configuration

import com.hiheo.jvm.learncache.services.BookService
import com.hiheo.jvm.learncache.services.CachingService
import net.sf.ehcache.Ehcache
import net.sf.ehcache.bootstrap.BootstrapCacheLoader
import net.sf.ehcache.bootstrap.BootstrapCacheLoaderFactory
import org.hibernate.cache.CacheException
import org.springframework.beans.factory.annotation.Autowired

class MyBootstrapCacheLoaderFactory extends BootstrapCacheLoaderFactory
    implements BootstrapCacheLoader

{
  public MyBootstrapCacheLoaderFactory() {
    super();
    // TODO Auto-generated constructor stub
  }

  @Override
  public BootstrapCacheLoader createBootstrapCacheLoader(Properties properties) {
    // TODO Auto-generated method stub

    return new MyBootstrapCacheLoaderFactory();
  }
  public Object clone() throws CloneNotSupportedException {
    // TODO Auto-generated method stub
    return super.clone();
  }

  public boolean isAsynchronous() {
    // TODO Auto-generated method stub
    return false;
  }

  @Autowired
  CachingService cachingService

  public void load(Ehcache myCache) throws CacheException {

    try {
      //place calls to the method that need to be cached  myService.findPagesWithText(bkReadByAll, textSearchedByAll)
      cachingService.loadAllCache()
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }
}
