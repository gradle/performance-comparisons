package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31988 {
    private final Productionnull_31988 production = new Productionnull_31988("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}