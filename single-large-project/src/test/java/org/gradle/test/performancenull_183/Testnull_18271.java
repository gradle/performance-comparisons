package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18271 {
    private final Productionnull_18271 production = new Productionnull_18271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}