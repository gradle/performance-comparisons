package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17484 {
    private final Productionnull_17484 production = new Productionnull_17484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}