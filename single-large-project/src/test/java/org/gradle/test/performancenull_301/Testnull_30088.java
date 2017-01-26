package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30088 {
    private final Productionnull_30088 production = new Productionnull_30088("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}