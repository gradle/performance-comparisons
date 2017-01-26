package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32943 {
    private final Productionnull_32943 production = new Productionnull_32943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}