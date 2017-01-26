package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49098 {
    private final Productionnull_49098 production = new Productionnull_49098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}