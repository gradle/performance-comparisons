package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20633 {
    private final Productionnull_20633 production = new Productionnull_20633("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}