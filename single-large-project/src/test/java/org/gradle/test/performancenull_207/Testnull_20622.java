package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20622 {
    private final Productionnull_20622 production = new Productionnull_20622("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}