package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32964 {
    private final Productionnull_32964 production = new Productionnull_32964("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}