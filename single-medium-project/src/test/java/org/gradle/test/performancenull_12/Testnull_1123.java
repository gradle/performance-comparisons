package org.gradle.test.performancenull_12;

import static org.junit.Assert.*;

public class Testnull_1123 {
    private final Productionnull_1123 production = new Productionnull_1123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}