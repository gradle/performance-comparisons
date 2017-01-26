package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4223 {
    private final Productionnull_4223 production = new Productionnull_4223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}