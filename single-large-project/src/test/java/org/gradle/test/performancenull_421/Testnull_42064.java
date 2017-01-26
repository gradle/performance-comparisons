package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42064 {
    private final Productionnull_42064 production = new Productionnull_42064("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}