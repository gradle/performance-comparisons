package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20478 {
    private final Productionnull_20478 production = new Productionnull_20478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}