package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7490 {
    private final Productionnull_7490 production = new Productionnull_7490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}