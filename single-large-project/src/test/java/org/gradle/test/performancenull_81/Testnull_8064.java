package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8064 {
    private final Productionnull_8064 production = new Productionnull_8064("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}