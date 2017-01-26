package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12064 {
    private final Productionnull_12064 production = new Productionnull_12064("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}