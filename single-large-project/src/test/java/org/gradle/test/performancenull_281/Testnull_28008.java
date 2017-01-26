package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28008 {
    private final Productionnull_28008 production = new Productionnull_28008("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}