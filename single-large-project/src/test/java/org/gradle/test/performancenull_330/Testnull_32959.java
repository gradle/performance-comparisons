package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32959 {
    private final Productionnull_32959 production = new Productionnull_32959("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}