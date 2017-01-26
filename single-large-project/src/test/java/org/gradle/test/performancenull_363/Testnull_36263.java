package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36263 {
    private final Productionnull_36263 production = new Productionnull_36263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}