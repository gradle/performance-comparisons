package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37956 {
    private final Productionnull_37956 production = new Productionnull_37956("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}