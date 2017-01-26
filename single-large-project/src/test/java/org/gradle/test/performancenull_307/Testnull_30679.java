package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30679 {
    private final Productionnull_30679 production = new Productionnull_30679("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}