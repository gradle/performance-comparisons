package org.gradle.test.performancenull_131;

import static org.junit.Assert.*;

public class Testnull_13080 {
    private final Productionnull_13080 production = new Productionnull_13080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}