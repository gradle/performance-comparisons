package org.gradle.test.performancenull_254;

import static org.junit.Assert.*;

public class Testnull_25354 {
    private final Productionnull_25354 production = new Productionnull_25354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}