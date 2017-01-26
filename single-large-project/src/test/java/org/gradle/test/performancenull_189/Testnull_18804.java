package org.gradle.test.performancenull_189;

import static org.junit.Assert.*;

public class Testnull_18804 {
    private final Productionnull_18804 production = new Productionnull_18804("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}