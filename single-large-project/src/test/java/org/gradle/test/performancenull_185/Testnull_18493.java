package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18493 {
    private final Productionnull_18493 production = new Productionnull_18493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}