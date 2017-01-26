package org.gradle.test.performancenull_191;

import static org.junit.Assert.*;

public class Testnull_19095 {
    private final Productionnull_19095 production = new Productionnull_19095("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}