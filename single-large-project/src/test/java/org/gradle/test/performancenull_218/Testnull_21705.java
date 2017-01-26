package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21705 {
    private final Productionnull_21705 production = new Productionnull_21705("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}