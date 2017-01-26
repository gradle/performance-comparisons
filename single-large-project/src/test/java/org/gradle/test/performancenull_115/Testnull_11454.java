package org.gradle.test.performancenull_115;

import static org.junit.Assert.*;

public class Testnull_11454 {
    private final Productionnull_11454 production = new Productionnull_11454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}