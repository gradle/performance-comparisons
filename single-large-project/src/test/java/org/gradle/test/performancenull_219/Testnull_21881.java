package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21881 {
    private final Productionnull_21881 production = new Productionnull_21881("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}