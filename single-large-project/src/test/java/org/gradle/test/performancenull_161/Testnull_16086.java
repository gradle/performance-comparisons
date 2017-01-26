package org.gradle.test.performancenull_161;

import static org.junit.Assert.*;

public class Testnull_16086 {
    private final Productionnull_16086 production = new Productionnull_16086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}