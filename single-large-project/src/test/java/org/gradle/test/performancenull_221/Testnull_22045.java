package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22045 {
    private final Productionnull_22045 production = new Productionnull_22045("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}