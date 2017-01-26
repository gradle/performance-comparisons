package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3705 {
    private final Productionnull_3705 production = new Productionnull_3705("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}