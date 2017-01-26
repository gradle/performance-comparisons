package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34943 {
    private final Productionnull_34943 production = new Productionnull_34943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}