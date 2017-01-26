package org.gradle.test.performancenull_26;

import static org.junit.Assert.*;

public class Testnull_2523 {
    private final Productionnull_2523 production = new Productionnull_2523("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}