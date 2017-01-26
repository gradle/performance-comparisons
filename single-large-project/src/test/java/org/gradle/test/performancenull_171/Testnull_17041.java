package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17041 {
    private final Productionnull_17041 production = new Productionnull_17041("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}