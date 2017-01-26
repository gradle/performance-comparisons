package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12950 {
    private final Productionnull_12950 production = new Productionnull_12950("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}