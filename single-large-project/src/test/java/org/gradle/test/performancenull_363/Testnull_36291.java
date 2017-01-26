package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36291 {
    private final Productionnull_36291 production = new Productionnull_36291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}