package org.gradle.test.performancenull_124;

import static org.junit.Assert.*;

public class Testnull_12386 {
    private final Productionnull_12386 production = new Productionnull_12386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}