package org.gradle.test.performancenull_354;

import static org.junit.Assert.*;

public class Testnull_35391 {
    private final Productionnull_35391 production = new Productionnull_35391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}