package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18275 {
    private final Productionnull_18275 production = new Productionnull_18275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}