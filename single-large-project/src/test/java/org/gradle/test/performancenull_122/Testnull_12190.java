package org.gradle.test.performancenull_122;

import static org.junit.Assert.*;

public class Testnull_12190 {
    private final Productionnull_12190 production = new Productionnull_12190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}