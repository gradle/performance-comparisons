package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36064 {
    private final Productionnull_36064 production = new Productionnull_36064("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}