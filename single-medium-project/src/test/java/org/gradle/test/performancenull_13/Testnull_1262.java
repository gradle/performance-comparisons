package org.gradle.test.performancenull_13;

import static org.junit.Assert.*;

public class Testnull_1262 {
    private final Productionnull_1262 production = new Productionnull_1262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}