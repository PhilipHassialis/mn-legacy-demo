package com.philip;

import javax.inject.Inject;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class HelloWorldController {

  // @Inject
  // private final HelloWorldService helloWorldService;

  private HelloWorldService service;

  public HelloWorldController(final HelloWorldService service) {
    this.service = service;
  }

  @Get("/")
  public String index() {
    return service.sayHi();
  }

}
