package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32913 {
    private final Productionnull_32913 production = new Productionnull_32913("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}