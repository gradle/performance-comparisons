package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11954 {
    private final Productionnull_11954 production = new Productionnull_11954("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}