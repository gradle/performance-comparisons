package org.gradle.test.performancenull_15;

import static org.junit.Assert.*;

public class Testnull_1491 {
    private final Productionnull_1491 production = new Productionnull_1491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}