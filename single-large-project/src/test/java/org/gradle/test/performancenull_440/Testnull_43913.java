package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43913 {
    private final Productionnull_43913 production = new Productionnull_43913("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}