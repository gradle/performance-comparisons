package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9832 {
    private final Productionnull_9832 production = new Productionnull_9832("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}