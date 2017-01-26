package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23099 {
    private final Productionnull_23099 production = new Productionnull_23099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}