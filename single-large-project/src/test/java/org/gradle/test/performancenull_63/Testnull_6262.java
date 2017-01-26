package org.gradle.test.performancenull_63;

import static org.junit.Assert.*;

public class Testnull_6262 {
    private final Productionnull_6262 production = new Productionnull_6262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}