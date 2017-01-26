package org.gradle.test.performancenull_11;

import static org.junit.Assert.*;

public class Testnull_1004 {
    private final Productionnull_1004 production = new Productionnull_1004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}