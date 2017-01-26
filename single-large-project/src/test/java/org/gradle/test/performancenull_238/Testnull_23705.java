package org.gradle.test.performancenull_238;

import static org.junit.Assert.*;

public class Testnull_23705 {
    private final Productionnull_23705 production = new Productionnull_23705("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}