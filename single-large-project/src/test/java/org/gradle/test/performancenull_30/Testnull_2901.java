package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2901 {
    private final Productionnull_2901 production = new Productionnull_2901("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}