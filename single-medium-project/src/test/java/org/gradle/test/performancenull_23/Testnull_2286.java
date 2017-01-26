package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2286 {
    private final Productionnull_2286 production = new Productionnull_2286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}