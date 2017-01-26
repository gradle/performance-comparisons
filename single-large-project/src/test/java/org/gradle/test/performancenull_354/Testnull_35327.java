package org.gradle.test.performancenull_354;

import static org.junit.Assert.*;

public class Testnull_35327 {
    private final Productionnull_35327 production = new Productionnull_35327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}