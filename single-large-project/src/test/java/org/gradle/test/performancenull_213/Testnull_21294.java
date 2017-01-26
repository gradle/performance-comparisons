package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21294 {
    private final Productionnull_21294 production = new Productionnull_21294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}