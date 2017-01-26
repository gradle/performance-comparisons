package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11948 {
    private final Productionnull_11948 production = new Productionnull_11948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}