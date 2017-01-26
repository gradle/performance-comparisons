package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23095 {
    private final Productionnull_23095 production = new Productionnull_23095("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}