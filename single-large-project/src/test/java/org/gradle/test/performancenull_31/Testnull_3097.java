package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3097 {
    private final Productionnull_3097 production = new Productionnull_3097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}