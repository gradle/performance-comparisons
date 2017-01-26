package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21051 {
    private final Productionnull_21051 production = new Productionnull_21051("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}