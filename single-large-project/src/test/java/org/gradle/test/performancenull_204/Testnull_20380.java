package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20380 {
    private final Productionnull_20380 production = new Productionnull_20380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}