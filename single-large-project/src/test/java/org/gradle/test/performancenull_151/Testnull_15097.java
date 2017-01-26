package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15097 {
    private final Productionnull_15097 production = new Productionnull_15097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}