package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25122 {
    private final Productionnull_25122 production = new Productionnull_25122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}