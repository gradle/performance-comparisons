package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22943 {
    private final Productionnull_22943 production = new Productionnull_22943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}