package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36296 {
    private final Productionnull_36296 production = new Productionnull_36296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}