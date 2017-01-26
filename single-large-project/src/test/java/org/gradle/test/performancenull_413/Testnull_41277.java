package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41277 {
    private final Productionnull_41277 production = new Productionnull_41277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}