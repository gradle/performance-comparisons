package org.gradle.test.performancenull_336;

import static org.junit.Assert.*;

public class Testnull_33578 {
    private final Productionnull_33578 production = new Productionnull_33578("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}