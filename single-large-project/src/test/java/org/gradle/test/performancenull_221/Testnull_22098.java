package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22098 {
    private final Productionnull_22098 production = new Productionnull_22098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}