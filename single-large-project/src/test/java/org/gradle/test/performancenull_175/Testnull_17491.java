package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17491 {
    private final Productionnull_17491 production = new Productionnull_17491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}