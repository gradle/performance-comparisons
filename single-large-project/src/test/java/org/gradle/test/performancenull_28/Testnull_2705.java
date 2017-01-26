package org.gradle.test.performancenull_28;

import static org.junit.Assert.*;

public class Testnull_2705 {
    private final Productionnull_2705 production = new Productionnull_2705("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}