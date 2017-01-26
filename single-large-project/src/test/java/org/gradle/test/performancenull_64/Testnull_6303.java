package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6303 {
    private final Productionnull_6303 production = new Productionnull_6303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}