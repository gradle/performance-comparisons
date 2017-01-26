package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2301 {
    private final Productionnull_2301 production = new Productionnull_2301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}