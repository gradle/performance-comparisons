package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1956 {
    private final Productionnull_1956 production = new Productionnull_1956("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}