package org.gradle.test.performancenull_161;

import static org.junit.Assert.*;

public class Testnull_16045 {
    private final Productionnull_16045 production = new Productionnull_16045("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}