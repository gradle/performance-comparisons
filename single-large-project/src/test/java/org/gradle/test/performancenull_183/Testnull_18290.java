package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18290 {
    private final Productionnull_18290 production = new Productionnull_18290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}