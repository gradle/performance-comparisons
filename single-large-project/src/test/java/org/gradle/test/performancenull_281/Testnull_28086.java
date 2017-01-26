package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28086 {
    private final Productionnull_28086 production = new Productionnull_28086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}