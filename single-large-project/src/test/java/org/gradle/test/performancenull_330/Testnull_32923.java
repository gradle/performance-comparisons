package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32923 {
    private final Productionnull_32923 production = new Productionnull_32923("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}