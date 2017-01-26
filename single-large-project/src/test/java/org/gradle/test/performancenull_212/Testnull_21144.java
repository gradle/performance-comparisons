package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21144 {
    private final Productionnull_21144 production = new Productionnull_21144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}