package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9426 {
    private final Productionnull_9426 production = new Productionnull_9426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}