package org.gradle.test.performancenull_13;

import static org.junit.Assert.*;

public class Testnull_1286 {
    private final Productionnull_1286 production = new Productionnull_1286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}