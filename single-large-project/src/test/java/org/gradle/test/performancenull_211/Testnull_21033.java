package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21033 {
    private final Productionnull_21033 production = new Productionnull_21033("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}