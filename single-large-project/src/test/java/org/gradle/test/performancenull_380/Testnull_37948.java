package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37948 {
    private final Productionnull_37948 production = new Productionnull_37948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}