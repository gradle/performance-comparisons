package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31932 {
    private final Productionnull_31932 production = new Productionnull_31932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}