package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15066 {
    private final Productionnull_15066 production = new Productionnull_15066("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}