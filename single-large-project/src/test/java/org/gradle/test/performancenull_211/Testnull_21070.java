package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21070 {
    private final Productionnull_21070 production = new Productionnull_21070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}