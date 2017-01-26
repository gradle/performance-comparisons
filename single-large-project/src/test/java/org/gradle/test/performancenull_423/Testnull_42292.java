package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42292 {
    private final Productionnull_42292 production = new Productionnull_42292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}