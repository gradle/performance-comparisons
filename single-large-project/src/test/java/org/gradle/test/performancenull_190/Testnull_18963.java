package org.gradle.test.performancenull_190;

import static org.junit.Assert.*;

public class Testnull_18963 {
    private final Productionnull_18963 production = new Productionnull_18963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}