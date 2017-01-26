package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1705 {
    private final Productionnull_1705 production = new Productionnull_1705("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}