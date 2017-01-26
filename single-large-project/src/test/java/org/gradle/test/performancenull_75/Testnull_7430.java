package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7430 {
    private final Productionnull_7430 production = new Productionnull_7430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}