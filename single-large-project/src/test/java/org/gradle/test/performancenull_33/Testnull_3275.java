package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3275 {
    private final Productionnull_3275 production = new Productionnull_3275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}