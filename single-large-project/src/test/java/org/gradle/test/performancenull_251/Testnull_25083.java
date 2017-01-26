package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25083 {
    private final Productionnull_25083 production = new Productionnull_25083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}