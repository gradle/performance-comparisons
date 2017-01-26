package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18285 {
    private final Productionnull_18285 production = new Productionnull_18285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}