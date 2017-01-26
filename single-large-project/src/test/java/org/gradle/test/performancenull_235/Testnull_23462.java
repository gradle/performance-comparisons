package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23462 {
    private final Productionnull_23462 production = new Productionnull_23462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}