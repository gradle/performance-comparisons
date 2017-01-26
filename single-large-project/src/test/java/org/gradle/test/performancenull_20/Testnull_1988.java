package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1988 {
    private final Productionnull_1988 production = new Productionnull_1988("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}