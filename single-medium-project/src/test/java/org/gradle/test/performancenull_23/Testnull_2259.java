package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2259 {
    private final Productionnull_2259 production = new Productionnull_2259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}