package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11982 {
    private final Productionnull_11982 production = new Productionnull_11982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}