package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24130 {
    private final Productionnull_24130 production = new Productionnull_24130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}