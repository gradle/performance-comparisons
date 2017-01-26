package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31901 {
    private final Productionnull_31901 production = new Productionnull_31901("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}