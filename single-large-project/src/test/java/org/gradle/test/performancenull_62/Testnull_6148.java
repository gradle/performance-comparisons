package org.gradle.test.performancenull_62;

import static org.junit.Assert.*;

public class Testnull_6148 {
    private final Productionnull_6148 production = new Productionnull_6148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}