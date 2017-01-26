package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23108 {
    private final Productionnull_23108 production = new Productionnull_23108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}