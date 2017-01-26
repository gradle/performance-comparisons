package org.gradle.test.performancenull_141;

import static org.junit.Assert.*;

public class Testnull_14098 {
    private final Productionnull_14098 production = new Productionnull_14098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}