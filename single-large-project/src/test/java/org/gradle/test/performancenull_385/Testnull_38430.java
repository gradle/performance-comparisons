package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38430 {
    private final Productionnull_38430 production = new Productionnull_38430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}