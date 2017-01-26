package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32086 {
    private final Productionnull_32086 production = new Productionnull_32086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}