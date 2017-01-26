package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11970 {
    private final Productionnull_11970 production = new Productionnull_11970("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}