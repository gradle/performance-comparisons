package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_11000 {
    private final Productionnull_11000 production = new Productionnull_11000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}