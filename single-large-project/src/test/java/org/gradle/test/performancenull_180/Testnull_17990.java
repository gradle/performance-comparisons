package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17990 {
    private final Productionnull_17990 production = new Productionnull_17990("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}