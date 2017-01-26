package org.gradle.test.performancenull_186;

import static org.junit.Assert.*;

public class Testnull_18580 {
    private final Productionnull_18580 production = new Productionnull_18580("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}