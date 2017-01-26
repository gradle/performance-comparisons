package org.gradle.test.performancenull_354;

import static org.junit.Assert.*;

public class Testnull_35348 {
    private final Productionnull_35348 production = new Productionnull_35348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}