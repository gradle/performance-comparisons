package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28063 {
    private final Productionnull_28063 production = new Productionnull_28063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}