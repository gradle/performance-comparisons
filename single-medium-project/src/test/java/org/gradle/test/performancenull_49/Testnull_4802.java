package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4802 {
    private final Productionnull_4802 production = new Productionnull_4802("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}