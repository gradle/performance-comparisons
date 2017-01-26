package org.gradle.test.performancenull_134;

import static org.junit.Assert.*;

public class Testnull_13380 {
    private final Productionnull_13380 production = new Productionnull_13380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}