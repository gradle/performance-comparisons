package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9932 {
    private final Productionnull_9932 production = new Productionnull_9932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}