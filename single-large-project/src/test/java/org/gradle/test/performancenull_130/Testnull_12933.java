package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12933 {
    private final Productionnull_12933 production = new Productionnull_12933("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}