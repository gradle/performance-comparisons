package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18008 {
    private final Productionnull_18008 production = new Productionnull_18008("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}