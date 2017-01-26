package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6322 {
    private final Productionnull_6322 production = new Productionnull_6322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}