package org.gradle.test.performancenull_71;

import static org.junit.Assert.*;

public class Testnull_7080 {
    private final Productionnull_7080 production = new Productionnull_7080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}