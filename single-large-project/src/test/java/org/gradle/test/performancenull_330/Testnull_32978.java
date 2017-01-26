package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32978 {
    private final Productionnull_32978 production = new Productionnull_32978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}