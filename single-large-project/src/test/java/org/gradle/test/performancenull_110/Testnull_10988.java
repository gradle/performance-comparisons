package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10988 {
    private final Productionnull_10988 production = new Productionnull_10988("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}