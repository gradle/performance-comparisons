package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4489 {
    private final Productionnull_4489 production = new Productionnull_4489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}