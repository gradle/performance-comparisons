package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23062 {
    private final Productionnull_23062 production = new Productionnull_23062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}