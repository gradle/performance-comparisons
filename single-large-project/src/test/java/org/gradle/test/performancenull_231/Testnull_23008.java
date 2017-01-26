package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23008 {
    private final Productionnull_23008 production = new Productionnull_23008("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}