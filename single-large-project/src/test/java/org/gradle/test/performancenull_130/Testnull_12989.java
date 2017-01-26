package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12989 {
    private final Productionnull_12989 production = new Productionnull_12989("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}