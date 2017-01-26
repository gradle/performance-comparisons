package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18095 {
    private final Productionnull_18095 production = new Productionnull_18095("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}