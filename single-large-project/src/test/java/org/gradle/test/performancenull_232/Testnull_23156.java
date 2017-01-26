package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23156 {
    private final Productionnull_23156 production = new Productionnull_23156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}