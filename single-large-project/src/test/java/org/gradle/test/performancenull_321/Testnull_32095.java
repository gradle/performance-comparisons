package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32095 {
    private final Productionnull_32095 production = new Productionnull_32095("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}