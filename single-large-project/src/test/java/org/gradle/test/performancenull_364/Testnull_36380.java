package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36380 {
    private final Productionnull_36380 production = new Productionnull_36380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}