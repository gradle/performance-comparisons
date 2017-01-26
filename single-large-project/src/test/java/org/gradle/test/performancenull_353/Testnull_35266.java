package org.gradle.test.performancenull_353;

import static org.junit.Assert.*;

public class Testnull_35266 {
    private final Productionnull_35266 production = new Productionnull_35266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}