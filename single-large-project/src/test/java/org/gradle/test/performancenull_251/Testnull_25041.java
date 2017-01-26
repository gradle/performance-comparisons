package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25041 {
    private final Productionnull_25041 production = new Productionnull_25041("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}