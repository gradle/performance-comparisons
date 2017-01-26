package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21250 {
    private final Productionnull_21250 production = new Productionnull_21250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}