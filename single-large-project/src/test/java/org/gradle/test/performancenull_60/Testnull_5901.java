package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5901 {
    private final Productionnull_5901 production = new Productionnull_5901("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}