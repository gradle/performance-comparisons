package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25749 {
    private final Productionnull_25749 production = new Productionnull_25749("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}