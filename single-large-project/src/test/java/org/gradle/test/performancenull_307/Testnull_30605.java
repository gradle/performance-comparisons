package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30605 {
    private final Productionnull_30605 production = new Productionnull_30605("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}