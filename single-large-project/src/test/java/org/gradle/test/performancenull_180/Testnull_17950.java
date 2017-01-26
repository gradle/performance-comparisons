package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17950 {
    private final Productionnull_17950 production = new Productionnull_17950("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}