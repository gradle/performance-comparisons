package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18431 {
    private final Productionnull_18431 production = new Productionnull_18431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}