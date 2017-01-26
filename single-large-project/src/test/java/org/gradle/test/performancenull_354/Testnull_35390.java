package org.gradle.test.performancenull_354;

import static org.junit.Assert.*;

public class Testnull_35390 {
    private final Productionnull_35390 production = new Productionnull_35390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}