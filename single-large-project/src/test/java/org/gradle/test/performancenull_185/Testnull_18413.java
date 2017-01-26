package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18413 {
    private final Productionnull_18413 production = new Productionnull_18413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}