package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1934 {
    private final Productionnull_1934 production = new Productionnull_1934("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}