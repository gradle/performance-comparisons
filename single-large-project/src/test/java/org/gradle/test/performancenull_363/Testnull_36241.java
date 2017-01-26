package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36241 {
    private final Productionnull_36241 production = new Productionnull_36241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}