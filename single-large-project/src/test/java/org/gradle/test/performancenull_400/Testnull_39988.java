package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39988 {
    private final Productionnull_39988 production = new Productionnull_39988("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}