package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34956 {
    private final Productionnull_34956 production = new Productionnull_34956("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}