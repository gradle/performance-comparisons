package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3240 {
    private final Productionnull_3240 production = new Productionnull_3240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}