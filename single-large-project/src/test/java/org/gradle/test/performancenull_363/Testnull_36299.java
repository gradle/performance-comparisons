package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36299 {
    private final Productionnull_36299 production = new Productionnull_36299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}