package org.gradle.test.performancenull_223;

import static org.junit.Assert.*;

public class Testnull_22290 {
    private final Productionnull_22290 production = new Productionnull_22290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}