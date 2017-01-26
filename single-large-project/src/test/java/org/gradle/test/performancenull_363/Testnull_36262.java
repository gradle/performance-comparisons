package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36262 {
    private final Productionnull_36262 production = new Productionnull_36262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}