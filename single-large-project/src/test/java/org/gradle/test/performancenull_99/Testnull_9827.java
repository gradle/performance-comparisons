package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9827 {
    private final Productionnull_9827 production = new Productionnull_9827("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}