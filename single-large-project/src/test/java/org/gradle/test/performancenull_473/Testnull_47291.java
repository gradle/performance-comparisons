package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47291 {
    private final Productionnull_47291 production = new Productionnull_47291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}