package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7919 {
    private final Productionnull_7919 production = new Productionnull_7919("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}