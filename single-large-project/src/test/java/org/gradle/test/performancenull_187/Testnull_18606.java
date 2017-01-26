package org.gradle.test.performancenull_187;

import static org.junit.Assert.*;

public class Testnull_18606 {
    private final Productionnull_18606 production = new Productionnull_18606("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}