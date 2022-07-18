package com.philip;

import javax.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.micronaut.context.annotation.Property;
import io.micronaut.context.event.StartupEvent;
import io.micronaut.runtime.event.annotation.EventListener;

// import io.micronaut.context.annotation.Value;

@Singleton
public class HelloWorldService {

  private static final Logger LOG = LoggerFactory.getLogger(Application.class);

  @EventListener
  public void onStartup(StartupEvent startupEvent) {
    LOG.debug("Startup {}", startupEvent);
  }

  @Property(name = "hello.service.greeting", defaultValue = "default greeting")
  private String greeting;

  public String sayHi() {
    return greeting;
  }
}
