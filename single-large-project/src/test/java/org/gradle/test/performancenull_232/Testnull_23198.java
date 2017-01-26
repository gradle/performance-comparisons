package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23198 {
    private final Productionnull_23198 production = new Productionnull_23198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}