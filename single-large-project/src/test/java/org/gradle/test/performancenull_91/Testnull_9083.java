package org.gradle.test.performancenull_91;

import static org.junit.Assert.*;

public class Testnull_9083 {
    private final Productionnull_9083 production = new Productionnull_9083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}