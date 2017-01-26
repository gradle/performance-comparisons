package org.gradle.test.performancenull_170;

import static org.junit.Assert.*;

public class Testnull_16978 {
    private final Productionnull_16978 production = new Productionnull_16978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}