package org.gradle.test.performancenull_134;

import static org.junit.Assert.*;

public class Testnull_13398 {
    private final Productionnull_13398 production = new Productionnull_13398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}