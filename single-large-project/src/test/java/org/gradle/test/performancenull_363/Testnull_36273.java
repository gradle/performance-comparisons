package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36273 {
    private final Productionnull_36273 production = new Productionnull_36273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}