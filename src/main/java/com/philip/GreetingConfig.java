package com.philip;

import javax.validation.constraints.NotBlank;

import io.micronaut.context.annotation.ConfigurationInject;
import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("hello.config.greeting")
public class GreetingConfig {

  private final String en;
  private final String gr;

  @ConfigurationInject
  public GreetingConfig(@NotBlank final String en, @NotBlank final String gr) {
    this.en = en;
    this.gr = gr;
  }

  public String getEn() {
    return en;
  }

  public String getGr() {
    return gr;
  }

}
