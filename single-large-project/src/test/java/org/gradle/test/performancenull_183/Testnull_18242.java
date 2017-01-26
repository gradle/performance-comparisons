package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18242 {
    private final Productionnull_18242 production = new Productionnull_18242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}