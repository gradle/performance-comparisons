package org.gradle.test.performancenull_170;

import static org.junit.Assert.*;

public class Testnull_16932 {
    private final Productionnull_16932 production = new Productionnull_16932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}