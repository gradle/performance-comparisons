package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2430 {
    private final Productionnull_2430 production = new Productionnull_2430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}