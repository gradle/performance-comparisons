package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6387 {
    private final Productionnull_6387 production = new Productionnull_6387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}