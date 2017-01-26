package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22988 {
    private final Productionnull_22988 production = new Productionnull_22988("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}