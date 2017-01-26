package org.gradle.test.performancenull_226;

import static org.junit.Assert.*;

public class Testnull_22563 {
    private final Productionnull_22563 production = new Productionnull_22563("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}