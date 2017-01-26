package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2423 {
    private final Productionnull_2423 production = new Productionnull_2423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}