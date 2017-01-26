package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40860 {
    private final Productionnull_40860 production = new Productionnull_40860("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}