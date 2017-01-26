package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24988 {
    private final Productionnull_24988 production = new Productionnull_24988("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}