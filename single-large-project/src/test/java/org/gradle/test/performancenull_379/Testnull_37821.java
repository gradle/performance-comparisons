package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37821 {
    private final Productionnull_37821 production = new Productionnull_37821("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}