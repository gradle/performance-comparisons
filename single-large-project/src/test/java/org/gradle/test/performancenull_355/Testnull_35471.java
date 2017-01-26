package org.gradle.test.performancenull_355;

import static org.junit.Assert.*;

public class Testnull_35471 {
    private final Productionnull_35471 production = new Productionnull_35471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}