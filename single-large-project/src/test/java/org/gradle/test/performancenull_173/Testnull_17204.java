package org.gradle.test.performancenull_173;

import static org.junit.Assert.*;

public class Testnull_17204 {
    private final Productionnull_17204 production = new Productionnull_17204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}