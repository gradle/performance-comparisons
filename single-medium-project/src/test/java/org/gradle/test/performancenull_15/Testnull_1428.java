package org.gradle.test.performancenull_15;

import static org.junit.Assert.*;

public class Testnull_1428 {
    private final Productionnull_1428 production = new Productionnull_1428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}