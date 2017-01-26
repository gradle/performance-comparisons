package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9958 {
    private final Productionnull_9958 production = new Productionnull_9958("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}