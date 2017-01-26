package org.gradle.test.performancenull_493;

import static org.junit.Assert.*;

public class Testnull_49285 {
    private final Productionnull_49285 production = new Productionnull_49285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}