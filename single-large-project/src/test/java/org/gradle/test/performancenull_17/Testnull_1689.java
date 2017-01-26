package org.gradle.test.performancenull_17;

import static org.junit.Assert.*;

public class Testnull_1689 {
    private final Productionnull_1689 production = new Productionnull_1689("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}