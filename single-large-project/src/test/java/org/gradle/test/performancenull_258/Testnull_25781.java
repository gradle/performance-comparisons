package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25781 {
    private final Productionnull_25781 production = new Productionnull_25781("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}