package org.gradle.test.performancenull_327;

import static org.junit.Assert.*;

public class Testnull_32645 {
    private final Productionnull_32645 production = new Productionnull_32645("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}