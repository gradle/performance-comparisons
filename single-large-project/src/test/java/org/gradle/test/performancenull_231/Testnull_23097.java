package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23097 {
    private final Productionnull_23097 production = new Productionnull_23097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}