package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9500 {
    private final Productionnull_9500 production = new Productionnull_9500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}