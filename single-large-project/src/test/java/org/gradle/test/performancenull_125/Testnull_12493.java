package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12493 {
    private final Productionnull_12493 production = new Productionnull_12493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}