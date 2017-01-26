package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23073 {
    private final Productionnull_23073 production = new Productionnull_23073("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}