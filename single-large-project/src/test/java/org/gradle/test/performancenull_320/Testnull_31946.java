package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31946 {
    private final Productionnull_31946 production = new Productionnull_31946("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}