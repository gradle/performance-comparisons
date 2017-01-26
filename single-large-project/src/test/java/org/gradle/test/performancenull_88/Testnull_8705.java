package org.gradle.test.performancenull_88;

import static org.junit.Assert.*;

public class Testnull_8705 {
    private final Productionnull_8705 production = new Productionnull_8705("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}