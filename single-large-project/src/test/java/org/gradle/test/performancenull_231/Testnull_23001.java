package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23001 {
    private final Productionnull_23001 production = new Productionnull_23001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}