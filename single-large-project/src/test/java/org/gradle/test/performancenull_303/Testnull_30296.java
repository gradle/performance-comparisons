package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30296 {
    private final Productionnull_30296 production = new Productionnull_30296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}