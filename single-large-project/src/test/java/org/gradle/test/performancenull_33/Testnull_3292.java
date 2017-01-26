package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3292 {
    private final Productionnull_3292 production = new Productionnull_3292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}