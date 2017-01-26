package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36461 {
    private final Productionnull_36461 production = new Productionnull_36461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}