package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12983 {
    private final Productionnull_12983 production = new Productionnull_12983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}