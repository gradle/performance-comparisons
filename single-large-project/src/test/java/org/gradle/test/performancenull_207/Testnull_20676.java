package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20676 {
    private final Productionnull_20676 production = new Productionnull_20676("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}