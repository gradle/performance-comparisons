package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30170 {
    private final Productionnull_30170 production = new Productionnull_30170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}