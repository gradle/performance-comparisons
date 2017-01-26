package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5004 {
    private final Productionnull_5004 production = new Productionnull_5004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}