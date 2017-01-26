package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21281 {
    private final Productionnull_21281 production = new Productionnull_21281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}