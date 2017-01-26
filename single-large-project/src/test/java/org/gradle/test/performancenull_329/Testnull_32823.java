package org.gradle.test.performancenull_329;

import static org.junit.Assert.*;

public class Testnull_32823 {
    private final Productionnull_32823 production = new Productionnull_32823("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}