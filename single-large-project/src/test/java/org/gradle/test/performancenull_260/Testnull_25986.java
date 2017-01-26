package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25986 {
    private final Productionnull_25986 production = new Productionnull_25986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}