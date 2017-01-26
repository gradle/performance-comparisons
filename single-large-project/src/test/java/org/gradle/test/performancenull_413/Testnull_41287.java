package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41287 {
    private final Productionnull_41287 production = new Productionnull_41287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}