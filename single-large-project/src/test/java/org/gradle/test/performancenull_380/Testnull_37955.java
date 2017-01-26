package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37955 {
    private final Productionnull_37955 production = new Productionnull_37955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}