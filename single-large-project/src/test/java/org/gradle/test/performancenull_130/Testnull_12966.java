package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12966 {
    private final Productionnull_12966 production = new Productionnull_12966("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}