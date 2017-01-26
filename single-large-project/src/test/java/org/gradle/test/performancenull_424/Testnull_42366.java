package org.gradle.test.performancenull_424;

import static org.junit.Assert.*;

public class Testnull_42366 {
    private final Productionnull_42366 production = new Productionnull_42366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}