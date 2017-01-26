package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32973 {
    private final Productionnull_32973 production = new Productionnull_32973("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}