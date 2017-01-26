package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25988 {
    private final Productionnull_25988 production = new Productionnull_25988("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}