package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3271 {
    private final Productionnull_3271 production = new Productionnull_3271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}