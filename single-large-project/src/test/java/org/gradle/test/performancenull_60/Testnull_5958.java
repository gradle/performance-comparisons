package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5958 {
    private final Productionnull_5958 production = new Productionnull_5958("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}