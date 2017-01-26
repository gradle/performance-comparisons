package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23088 {
    private final Productionnull_23088 production = new Productionnull_23088("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}