package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36206 {
    private final Productionnull_36206 production = new Productionnull_36206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}