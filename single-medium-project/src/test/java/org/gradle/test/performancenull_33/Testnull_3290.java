package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3290 {
    private final Productionnull_3290 production = new Productionnull_3290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}