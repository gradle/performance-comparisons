package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18403 {
    private final Productionnull_18403 production = new Productionnull_18403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}