package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31989 {
    private final Productionnull_31989 production = new Productionnull_31989("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}