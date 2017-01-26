package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3206 {
    private final Productionnull_3206 production = new Productionnull_3206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}