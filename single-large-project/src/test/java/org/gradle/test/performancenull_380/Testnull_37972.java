package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37972 {
    private final Productionnull_37972 production = new Productionnull_37972("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}