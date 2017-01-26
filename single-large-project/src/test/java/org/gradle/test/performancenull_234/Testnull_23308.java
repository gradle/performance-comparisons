package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23308 {
    private final Productionnull_23308 production = new Productionnull_23308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}