package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18455 {
    private final Productionnull_18455 production = new Productionnull_18455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}