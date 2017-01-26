package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23070 {
    private final Productionnull_23070 production = new Productionnull_23070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}