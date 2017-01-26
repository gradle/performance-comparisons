package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20500 {
    private final Productionnull_20500 production = new Productionnull_20500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}