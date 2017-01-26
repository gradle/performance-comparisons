package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43430 {
    private final Productionnull_43430 production = new Productionnull_43430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}