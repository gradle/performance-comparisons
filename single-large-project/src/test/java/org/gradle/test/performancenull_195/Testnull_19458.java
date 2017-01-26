package org.gradle.test.performancenull_195;

import static org.junit.Assert.*;

public class Testnull_19458 {
    private final Productionnull_19458 production = new Productionnull_19458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}