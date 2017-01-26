package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9835 {
    private final Productionnull_9835 production = new Productionnull_9835("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}