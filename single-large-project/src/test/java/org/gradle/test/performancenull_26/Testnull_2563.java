package org.gradle.test.performancenull_26;

import static org.junit.Assert.*;

public class Testnull_2563 {
    private final Productionnull_2563 production = new Productionnull_2563("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}