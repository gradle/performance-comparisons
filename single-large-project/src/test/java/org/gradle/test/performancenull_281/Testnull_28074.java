package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28074 {
    private final Productionnull_28074 production = new Productionnull_28074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}