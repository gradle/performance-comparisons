package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32946 {
    private final Productionnull_32946 production = new Productionnull_32946("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}