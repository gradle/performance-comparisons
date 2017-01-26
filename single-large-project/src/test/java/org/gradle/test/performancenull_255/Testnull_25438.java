package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25438 {
    private final Productionnull_25438 production = new Productionnull_25438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}