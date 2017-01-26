package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21228 {
    private final Productionnull_21228 production = new Productionnull_21228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}