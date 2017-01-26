package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36338 {
    private final Productionnull_36338 production = new Productionnull_36338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}