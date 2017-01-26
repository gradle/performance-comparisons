package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11950 {
    private final Productionnull_11950 production = new Productionnull_11950("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}