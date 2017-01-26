package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32988 {
    private final Productionnull_32988 production = new Productionnull_32988("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}