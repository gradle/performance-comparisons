package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9841 {
    private final Productionnull_9841 production = new Productionnull_9841("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}