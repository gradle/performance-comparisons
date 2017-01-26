package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36298 {
    private final Productionnull_36298 production = new Productionnull_36298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}