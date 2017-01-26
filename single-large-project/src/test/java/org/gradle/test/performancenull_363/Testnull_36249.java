package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36249 {
    private final Productionnull_36249 production = new Productionnull_36249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}