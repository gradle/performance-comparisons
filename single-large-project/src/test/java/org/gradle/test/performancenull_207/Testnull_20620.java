package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20620 {
    private final Productionnull_20620 production = new Productionnull_20620("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}