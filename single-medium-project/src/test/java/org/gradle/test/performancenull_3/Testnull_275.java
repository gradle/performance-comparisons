package org.gradle.test.performancenull_3;

import static org.junit.Assert.*;

public class Testnull_275 {
    private final Productionnull_275 production = new Productionnull_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}