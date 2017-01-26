package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37967 {
    private final Productionnull_37967 production = new Productionnull_37967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}