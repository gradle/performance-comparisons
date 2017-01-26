package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20448 {
    private final Productionnull_20448 production = new Productionnull_20448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}