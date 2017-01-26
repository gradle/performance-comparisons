package org.gradle.test.performancenull_399;

import static org.junit.Assert.*;

public class Testnull_39823 {
    private final Productionnull_39823 production = new Productionnull_39823("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}