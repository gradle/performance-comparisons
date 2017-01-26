package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23065 {
    private final Productionnull_23065 production = new Productionnull_23065("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}