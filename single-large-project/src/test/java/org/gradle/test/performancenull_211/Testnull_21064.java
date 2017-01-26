package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21064 {
    private final Productionnull_21064 production = new Productionnull_21064("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}