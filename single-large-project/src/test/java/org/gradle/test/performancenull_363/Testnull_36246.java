package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36246 {
    private final Productionnull_36246 production = new Productionnull_36246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}