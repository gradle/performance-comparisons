package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25778 {
    private final Productionnull_25778 production = new Productionnull_25778("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}