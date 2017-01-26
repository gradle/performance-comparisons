package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9949 {
    private final Productionnull_9949 production = new Productionnull_9949("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}