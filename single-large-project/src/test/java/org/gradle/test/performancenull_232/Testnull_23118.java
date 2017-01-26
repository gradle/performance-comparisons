package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23118 {
    private final Productionnull_23118 production = new Productionnull_23118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}