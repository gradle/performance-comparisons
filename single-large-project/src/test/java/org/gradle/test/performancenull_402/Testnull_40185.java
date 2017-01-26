package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40185 {
    private final Productionnull_40185 production = new Productionnull_40185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}