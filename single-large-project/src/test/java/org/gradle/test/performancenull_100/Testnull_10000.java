package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_10000 {
    private final Productionnull_10000 production = new Productionnull_10000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}