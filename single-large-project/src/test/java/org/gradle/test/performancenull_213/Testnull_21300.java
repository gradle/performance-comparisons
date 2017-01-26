package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21300 {
    private final Productionnull_21300 production = new Productionnull_21300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}