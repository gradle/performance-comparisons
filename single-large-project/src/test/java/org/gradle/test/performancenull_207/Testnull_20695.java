package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20695 {
    private final Productionnull_20695 production = new Productionnull_20695("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}