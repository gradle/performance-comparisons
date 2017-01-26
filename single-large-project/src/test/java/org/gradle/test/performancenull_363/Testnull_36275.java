package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36275 {
    private final Productionnull_36275 production = new Productionnull_36275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}