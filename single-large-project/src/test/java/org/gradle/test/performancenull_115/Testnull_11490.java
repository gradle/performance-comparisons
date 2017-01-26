package org.gradle.test.performancenull_115;

import static org.junit.Assert.*;

public class Testnull_11490 {
    private final Productionnull_11490 production = new Productionnull_11490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}