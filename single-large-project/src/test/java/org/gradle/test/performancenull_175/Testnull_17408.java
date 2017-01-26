package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17408 {
    private final Productionnull_17408 production = new Productionnull_17408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}