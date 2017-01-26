package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22007 {
    private final Productionnull_22007 production = new Productionnull_22007("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}