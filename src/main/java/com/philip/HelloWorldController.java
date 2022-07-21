package com.philip;

// import javax.inject.Inject;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("${hello.controller.path}")
public class HelloWorldController {

  // @Inject
  // private final HelloWorldService helloWorldService;

  private HelloWorldService service;
  private final GreetingConfig config;

  public HelloWorldController(final HelloWorldService service, final GreetingConfig config) {
    this.service = service;
    this.config = config;
  }

  @Get("/")
  public String index() {
    return service.sayHi();
  }

  @Get("/gr")
  public String greetInGreek() {
    return config.getGr();
  }

  @Get("/en")
  public String greetInEnglish() {
    return config.getEn();
  }

  @Get("/json")
  public Greeting json() {
    return new Greeting();
  }

}
