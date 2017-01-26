package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18496 {
    private final Productionnull_18496 production = new Productionnull_18496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}