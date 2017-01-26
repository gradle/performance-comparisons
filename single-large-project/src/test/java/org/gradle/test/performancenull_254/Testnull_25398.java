package org.gradle.test.performancenull_254;

import static org.junit.Assert.*;

public class Testnull_25398 {
    private final Productionnull_25398 production = new Productionnull_25398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}