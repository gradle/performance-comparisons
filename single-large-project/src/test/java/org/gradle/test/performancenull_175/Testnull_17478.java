package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17478 {
    private final Productionnull_17478 production = new Productionnull_17478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}