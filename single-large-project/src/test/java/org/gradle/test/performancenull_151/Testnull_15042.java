package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15042 {
    private final Productionnull_15042 production = new Productionnull_15042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}