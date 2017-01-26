package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28088 {
    private final Productionnull_28088 production = new Productionnull_28088("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}