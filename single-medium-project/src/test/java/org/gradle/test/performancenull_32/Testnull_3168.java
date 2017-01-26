package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3168 {
    private final Productionnull_3168 production = new Productionnull_3168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}