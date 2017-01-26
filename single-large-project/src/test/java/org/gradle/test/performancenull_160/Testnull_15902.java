package org.gradle.test.performancenull_160;

import static org.junit.Assert.*;

public class Testnull_15902 {
    private final Productionnull_15902 production = new Productionnull_15902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}