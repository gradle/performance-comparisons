package org.gradle.test.performancenull_233;

import static org.junit.Assert.*;

public class Testnull_23219 {
    private final Productionnull_23219 production = new Productionnull_23219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}