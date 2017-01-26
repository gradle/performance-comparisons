package org.gradle.test.performancenull_193;

import static org.junit.Assert.*;

public class Testnull_19286 {
    private final Productionnull_19286 production = new Productionnull_19286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}