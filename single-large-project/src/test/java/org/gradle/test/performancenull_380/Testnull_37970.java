package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37970 {
    private final Productionnull_37970 production = new Productionnull_37970("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}