package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21205 {
    private final Productionnull_21205 production = new Productionnull_21205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}