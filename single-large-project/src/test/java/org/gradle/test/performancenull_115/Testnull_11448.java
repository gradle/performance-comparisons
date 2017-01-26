package org.gradle.test.performancenull_115;

import static org.junit.Assert.*;

public class Testnull_11448 {
    private final Productionnull_11448 production = new Productionnull_11448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}