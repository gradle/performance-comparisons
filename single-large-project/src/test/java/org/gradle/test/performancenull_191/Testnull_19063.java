package org.gradle.test.performancenull_191;

import static org.junit.Assert.*;

public class Testnull_19063 {
    private final Productionnull_19063 production = new Productionnull_19063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}