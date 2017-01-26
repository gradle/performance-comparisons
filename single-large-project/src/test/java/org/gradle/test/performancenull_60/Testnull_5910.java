package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5910 {
    private final Productionnull_5910 production = new Productionnull_5910("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}