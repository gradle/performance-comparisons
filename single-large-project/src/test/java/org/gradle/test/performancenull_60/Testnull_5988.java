package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5988 {
    private final Productionnull_5988 production = new Productionnull_5988("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}