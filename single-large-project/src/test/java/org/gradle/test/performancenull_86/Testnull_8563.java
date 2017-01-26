package org.gradle.test.performancenull_86;

import static org.junit.Assert.*;

public class Testnull_8563 {
    private final Productionnull_8563 production = new Productionnull_8563("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}