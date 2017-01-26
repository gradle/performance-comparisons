package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9940 {
    private final Productionnull_9940 production = new Productionnull_9940("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}