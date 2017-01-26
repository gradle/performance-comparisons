package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25296 {
    private final Productionnull_25296 production = new Productionnull_25296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}