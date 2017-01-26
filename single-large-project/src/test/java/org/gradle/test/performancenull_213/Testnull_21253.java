package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21253 {
    private final Productionnull_21253 production = new Productionnull_21253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}