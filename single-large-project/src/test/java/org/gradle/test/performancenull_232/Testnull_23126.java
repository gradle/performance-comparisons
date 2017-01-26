package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23126 {
    private final Productionnull_23126 production = new Productionnull_23126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}