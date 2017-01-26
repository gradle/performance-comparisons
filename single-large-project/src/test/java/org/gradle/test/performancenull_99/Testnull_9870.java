package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9870 {
    private final Productionnull_9870 production = new Productionnull_9870("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}