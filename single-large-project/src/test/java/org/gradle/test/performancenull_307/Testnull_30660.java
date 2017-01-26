package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30660 {
    private final Productionnull_30660 production = new Productionnull_30660("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}