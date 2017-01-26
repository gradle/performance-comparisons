package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21298 {
    private final Productionnull_21298 production = new Productionnull_21298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}