package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37988 {
    private final Productionnull_37988 production = new Productionnull_37988("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}