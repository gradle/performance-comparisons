package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3202 {
    private final Productionnull_3202 production = new Productionnull_3202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}