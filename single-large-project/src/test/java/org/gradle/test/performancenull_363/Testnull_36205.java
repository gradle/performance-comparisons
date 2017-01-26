package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36205 {
    private final Productionnull_36205 production = new Productionnull_36205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}