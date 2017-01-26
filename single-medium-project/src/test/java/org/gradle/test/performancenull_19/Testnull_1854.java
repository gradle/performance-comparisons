package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1854 {
    private final Productionnull_1854 production = new Productionnull_1854("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}