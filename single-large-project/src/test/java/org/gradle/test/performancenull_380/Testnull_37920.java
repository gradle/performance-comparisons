package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37920 {
    private final Productionnull_37920 production = new Productionnull_37920("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}