package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9830 {
    private final Productionnull_9830 production = new Productionnull_9830("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}