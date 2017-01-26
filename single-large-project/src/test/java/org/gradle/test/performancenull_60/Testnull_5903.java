package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5903 {
    private final Productionnull_5903 production = new Productionnull_5903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}