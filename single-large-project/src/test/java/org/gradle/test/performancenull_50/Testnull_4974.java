package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4974 {
    private final Productionnull_4974 production = new Productionnull_4974("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}