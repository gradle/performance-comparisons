package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4292 {
    private final Productionnull_4292 production = new Productionnull_4292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}