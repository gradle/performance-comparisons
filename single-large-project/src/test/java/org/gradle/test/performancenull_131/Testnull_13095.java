package org.gradle.test.performancenull_131;

import static org.junit.Assert.*;

public class Testnull_13095 {
    private final Productionnull_13095 production = new Productionnull_13095("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}