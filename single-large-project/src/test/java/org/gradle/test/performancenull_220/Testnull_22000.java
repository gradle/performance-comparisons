package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_22000 {
    private final Productionnull_22000 production = new Productionnull_22000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}