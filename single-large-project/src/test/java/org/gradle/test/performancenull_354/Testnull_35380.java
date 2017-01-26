package org.gradle.test.performancenull_354;

import static org.junit.Assert.*;

public class Testnull_35380 {
    private final Productionnull_35380 production = new Productionnull_35380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}