package org.gradle.test.performancenull_354;

import static org.junit.Assert.*;

public class Testnull_35373 {
    private final Productionnull_35373 production = new Productionnull_35373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}