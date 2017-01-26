package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4916 {
    private final Productionnull_4916 production = new Productionnull_4916("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}