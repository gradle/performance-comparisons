package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4934 {
    private final Productionnull_4934 production = new Productionnull_4934("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}