package org.gradle.test.performancenull_114;

import static org.junit.Assert.*;

public class Testnull_11382 {
    private final Productionnull_11382 production = new Productionnull_11382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}