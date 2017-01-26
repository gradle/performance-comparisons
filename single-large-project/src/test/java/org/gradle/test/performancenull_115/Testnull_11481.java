package org.gradle.test.performancenull_115;

import static org.junit.Assert.*;

public class Testnull_11481 {
    private final Productionnull_11481 production = new Productionnull_11481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}