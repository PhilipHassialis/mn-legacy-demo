package com.philip;

import java.math.BigDecimal;
import java.time.Instant;

import lombok.Data;

@Data
public class Greeting {

  final String myText = "Hello world";
  final BigDecimal id = BigDecimal.valueOf(1234567);
  final Instant timeUTC = Instant.now();

}
