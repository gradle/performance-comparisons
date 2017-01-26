package org.gradle.test.performancenull_487;

import static org.junit.Assert.*;

public class Testnull_48601 {
    private final Productionnull_48601 production = new Productionnull_48601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}