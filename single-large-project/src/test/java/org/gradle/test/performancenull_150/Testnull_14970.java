package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14970 {
    private final Productionnull_14970 production = new Productionnull_14970("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}