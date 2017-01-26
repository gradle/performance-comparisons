package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37950 {
    private final Productionnull_37950 production = new Productionnull_37950("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}