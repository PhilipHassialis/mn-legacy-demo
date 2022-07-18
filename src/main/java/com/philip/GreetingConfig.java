package com.philip;

import javax.validation.constraints.NotBlank;

import io.micronaut.context.annotation.ConfigurationInject;
import io.micronaut.context.annotation.ConfigurationProperties;
import lombok.Getter;

@ConfigurationProperties("hello.config.greeting")
public class GreetingConfig {

  @Getter
  private final String en;
  @Getter
  private final String gr;

  @ConfigurationInject
  public GreetingConfig(@NotBlank final String en, @NotBlank final String gr) {
    this.en = en;
    this.gr = gr;
  }

  // public String getEn() {
  // return en;
  // }

  // public String getGr() {
  // return gr;
  // }

}
