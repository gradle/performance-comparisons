package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33496 {
    private final Productionnull_33496 production = new Productionnull_33496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}