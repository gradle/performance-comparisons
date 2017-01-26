package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42279 {
    private final Productionnull_42279 production = new Productionnull_42279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}