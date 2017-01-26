package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21260 {
    private final Productionnull_21260 production = new Productionnull_21260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}