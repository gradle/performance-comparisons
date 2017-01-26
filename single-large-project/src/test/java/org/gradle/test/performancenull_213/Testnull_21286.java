package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21286 {
    private final Productionnull_21286 production = new Productionnull_21286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}