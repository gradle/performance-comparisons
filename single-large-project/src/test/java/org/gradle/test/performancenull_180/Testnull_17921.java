package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17921 {
    private final Productionnull_17921 production = new Productionnull_17921("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}