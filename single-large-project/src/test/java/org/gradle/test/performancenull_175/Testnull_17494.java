package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17494 {
    private final Productionnull_17494 production = new Productionnull_17494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}