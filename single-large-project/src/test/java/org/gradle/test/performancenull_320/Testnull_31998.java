package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31998 {
    private final Productionnull_31998 production = new Productionnull_31998("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}