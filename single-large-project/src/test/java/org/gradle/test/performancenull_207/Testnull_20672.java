package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20672 {
    private final Productionnull_20672 production = new Productionnull_20672("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}