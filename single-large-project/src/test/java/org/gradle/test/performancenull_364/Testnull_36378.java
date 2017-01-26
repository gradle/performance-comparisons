package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36378 {
    private final Productionnull_36378 production = new Productionnull_36378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}