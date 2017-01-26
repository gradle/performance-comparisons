package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23089 {
    private final Productionnull_23089 production = new Productionnull_23089("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}