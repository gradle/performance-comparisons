package org.gradle.test.performancenull_354;

import static org.junit.Assert.*;

public class Testnull_35395 {
    private final Productionnull_35395 production = new Productionnull_35395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}