package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30068 {
    private final Productionnull_30068 production = new Productionnull_30068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}