package org.gradle.test.performancenull_481;

import static org.junit.Assert.*;

public class Testnull_48080 {
    private final Productionnull_48080 production = new Productionnull_48080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}