package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43278 {
    private final Productionnull_43278 production = new Productionnull_43278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}