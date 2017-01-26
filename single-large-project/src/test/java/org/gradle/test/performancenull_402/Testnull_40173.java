package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40173 {
    private final Productionnull_40173 production = new Productionnull_40173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}