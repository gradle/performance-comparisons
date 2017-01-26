package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22008 {
    private final Productionnull_22008 production = new Productionnull_22008("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}