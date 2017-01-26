package org.gradle.test.performancenull_348;

import static org.junit.Assert.*;

public class Testnull_34705 {
    private final Productionnull_34705 production = new Productionnull_34705("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}