package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31430 {
    private final Productionnull_31430 production = new Productionnull_31430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}