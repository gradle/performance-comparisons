package org.gradle.test.performancenull_15;

import static org.junit.Assert.*;

public class Testnull_1405 {
    private final Productionnull_1405 production = new Productionnull_1405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}