package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1909 {
    private final Productionnull_1909 production = new Productionnull_1909("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}