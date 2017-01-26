package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25042 {
    private final Productionnull_25042 production = new Productionnull_25042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}