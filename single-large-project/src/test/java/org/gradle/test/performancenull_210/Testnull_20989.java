package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20989 {
    private final Productionnull_20989 production = new Productionnull_20989("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}