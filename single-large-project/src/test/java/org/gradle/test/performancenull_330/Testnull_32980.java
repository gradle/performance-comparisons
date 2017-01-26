package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32980 {
    private final Productionnull_32980 production = new Productionnull_32980("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}