package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49970 {
    private final Productionnull_49970 production = new Productionnull_49970("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}