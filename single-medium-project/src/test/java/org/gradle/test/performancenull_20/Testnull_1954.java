package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1954 {
    private final Productionnull_1954 production = new Productionnull_1954("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}