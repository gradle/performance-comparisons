package org.gradle.test.performancenull_170;

import static org.junit.Assert.*;

public class Testnull_16954 {
    private final Productionnull_16954 production = new Productionnull_16954("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}