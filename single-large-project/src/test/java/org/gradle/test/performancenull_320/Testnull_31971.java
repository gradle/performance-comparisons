package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31971 {
    private final Productionnull_31971 production = new Productionnull_31971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}