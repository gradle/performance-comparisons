package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32001 {
    private final Productionnull_32001 production = new Productionnull_32001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}