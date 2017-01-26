package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24974 {
    private final Productionnull_24974 production = new Productionnull_24974("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}