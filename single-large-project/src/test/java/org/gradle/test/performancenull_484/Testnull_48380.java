package org.gradle.test.performancenull_484;

import static org.junit.Assert.*;

public class Testnull_48380 {
    private final Productionnull_48380 production = new Productionnull_48380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}