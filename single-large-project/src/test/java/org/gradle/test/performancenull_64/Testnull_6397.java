package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6397 {
    private final Productionnull_6397 production = new Productionnull_6397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}