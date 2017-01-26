package org.gradle.test.performancenull_317;

import static org.junit.Assert.*;

public class Testnull_31645 {
    private final Productionnull_31645 production = new Productionnull_31645("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}