package org.gradle.test.performancenull_223;

import static org.junit.Assert.*;

public class Testnull_22206 {
    private final Productionnull_22206 production = new Productionnull_22206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}