package org.gradle.test.performancenull_354;

import static org.junit.Assert.*;

public class Testnull_35343 {
    private final Productionnull_35343 production = new Productionnull_35343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}