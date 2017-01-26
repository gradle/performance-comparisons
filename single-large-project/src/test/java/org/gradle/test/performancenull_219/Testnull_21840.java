package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21840 {
    private final Productionnull_21840 production = new Productionnull_21840("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}