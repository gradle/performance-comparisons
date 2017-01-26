package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6380 {
    private final Productionnull_6380 production = new Productionnull_6380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}