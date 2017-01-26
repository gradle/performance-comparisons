package org.gradle.test.performancenull_165;

import static org.junit.Assert.*;

public class Testnull_16500 {
    private final Productionnull_16500 production = new Productionnull_16500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}