package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17902 {
    private final Productionnull_17902 production = new Productionnull_17902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}