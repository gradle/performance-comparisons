package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9883 {
    private final Productionnull_9883 production = new Productionnull_9883("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}