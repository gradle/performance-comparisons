package org.gradle.test.performancenull_15;

import static org.junit.Assert.*;

public class Testnull_1434 {
    private final Productionnull_1434 production = new Productionnull_1434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}