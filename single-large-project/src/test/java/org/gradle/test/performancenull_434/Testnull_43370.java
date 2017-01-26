package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43370 {
    private final Productionnull_43370 production = new Productionnull_43370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}