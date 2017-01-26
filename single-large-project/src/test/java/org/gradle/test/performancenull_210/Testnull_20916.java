package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20916 {
    private final Productionnull_20916 production = new Productionnull_20916("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}