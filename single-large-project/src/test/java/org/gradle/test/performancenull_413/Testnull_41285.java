package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41285 {
    private final Productionnull_41285 production = new Productionnull_41285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}