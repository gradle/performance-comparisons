package org.gradle.test.performancenull_357;

import static org.junit.Assert.*;

public class Testnull_35601 {
    private final Productionnull_35601 production = new Productionnull_35601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}