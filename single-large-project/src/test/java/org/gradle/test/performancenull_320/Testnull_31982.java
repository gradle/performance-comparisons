package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31982 {
    private final Productionnull_31982 production = new Productionnull_31982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}