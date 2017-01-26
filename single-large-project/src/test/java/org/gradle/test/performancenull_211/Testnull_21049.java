package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21049 {
    private final Productionnull_21049 production = new Productionnull_21049("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}