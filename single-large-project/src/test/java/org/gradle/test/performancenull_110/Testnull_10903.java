package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10903 {
    private final Productionnull_10903 production = new Productionnull_10903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}