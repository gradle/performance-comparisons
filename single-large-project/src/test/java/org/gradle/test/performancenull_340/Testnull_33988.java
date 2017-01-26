package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33988 {
    private final Productionnull_33988 production = new Productionnull_33988("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}