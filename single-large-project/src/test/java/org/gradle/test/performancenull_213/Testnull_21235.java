package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21235 {
    private final Productionnull_21235 production = new Productionnull_21235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}