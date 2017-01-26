package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17933 {
    private final Productionnull_17933 production = new Productionnull_17933("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}