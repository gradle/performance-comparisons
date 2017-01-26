package org.gradle.test.performancenull_245;

import static org.junit.Assert.*;

public class Testnull_24481 {
    private final Productionnull_24481 production = new Productionnull_24481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}