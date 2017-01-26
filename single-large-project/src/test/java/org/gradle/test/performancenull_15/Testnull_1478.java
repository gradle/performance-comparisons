package org.gradle.test.performancenull_15;

import static org.junit.Assert.*;

public class Testnull_1478 {
    private final Productionnull_1478 production = new Productionnull_1478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}