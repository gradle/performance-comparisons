package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5920 {
    private final Productionnull_5920 production = new Productionnull_5920("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}