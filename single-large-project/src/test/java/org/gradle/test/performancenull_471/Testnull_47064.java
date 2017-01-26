package org.gradle.test.performancenull_471;

import static org.junit.Assert.*;

public class Testnull_47064 {
    private final Productionnull_47064 production = new Productionnull_47064("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}