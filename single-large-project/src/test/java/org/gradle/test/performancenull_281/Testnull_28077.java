package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28077 {
    private final Productionnull_28077 production = new Productionnull_28077("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}