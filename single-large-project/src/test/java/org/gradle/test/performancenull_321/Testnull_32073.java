package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32073 {
    private final Productionnull_32073 production = new Productionnull_32073("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}