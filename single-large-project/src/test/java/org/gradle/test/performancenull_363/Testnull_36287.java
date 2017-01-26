package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36287 {
    private final Productionnull_36287 production = new Productionnull_36287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}