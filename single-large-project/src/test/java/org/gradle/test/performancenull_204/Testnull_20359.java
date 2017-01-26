package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20359 {
    private final Productionnull_20359 production = new Productionnull_20359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}