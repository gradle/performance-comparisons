package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22074 {
    private final Productionnull_22074 production = new Productionnull_22074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}