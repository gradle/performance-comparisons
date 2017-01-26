package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17974 {
    private final Productionnull_17974 production = new Productionnull_17974("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}