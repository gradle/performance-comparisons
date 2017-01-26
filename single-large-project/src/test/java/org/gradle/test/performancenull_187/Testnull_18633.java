package org.gradle.test.performancenull_187;

import static org.junit.Assert.*;

public class Testnull_18633 {
    private final Productionnull_18633 production = new Productionnull_18633("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}