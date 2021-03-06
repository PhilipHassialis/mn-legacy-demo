package com.philip;

import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.node.ObjectNode;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.inject.Inject;

@MicronautTest
class HelloWorldControllerTest {

    @Inject
    EmbeddedApplication<?> application;

    @Inject
    @Client("/")
    RxHttpClient client;

    @Test
    void testItWorks() {
        Assertions.assertTrue(application.isRunning());
    }

    @Test
    void testHelloResponse() {
        final String result = client.toBlocking().retrieve("/hello");
        assertEquals("Hello from service", result);
    }

    @Test
    void returnGreekGreeting() {
        final String result = client.toBlocking().retrieve("/hello/gr");
        assertEquals("Χαίρετε", result);
    }

    @Test
    void returnEnglishGreeting() {
        final String result = client.toBlocking().retrieve("/hello/en");
        assertEquals("Hello", result);
    }

    @Test
    void returnGreetingAsJson() {
        final ObjectNode result = client.toBlocking().retrieve("/hello/json", ObjectNode.class);
        assertEquals("someJson", result.toString());
    }
}
