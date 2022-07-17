package com.philip;

import javax.inject.Singleton;

@Singleton
public class HelloWorldService {
  public String sayHi() {
    return "Hello from service";
  }
}
