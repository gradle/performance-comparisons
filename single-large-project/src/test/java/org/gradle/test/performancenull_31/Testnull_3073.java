package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3073 {
    private final Productionnull_3073 production = new Productionnull_3073("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}