package com.philip;

import javax.inject.Singleton;

import io.micronaut.context.annotation.Property;

// import io.micronaut.context.annotation.Value;

@Singleton
public class HelloWorldService {

  @Property(name = "hello.service.greeting", defaultValue = "default greeting")
  private String greeting;

  public String sayHi() {
    return greeting;
  }
}
