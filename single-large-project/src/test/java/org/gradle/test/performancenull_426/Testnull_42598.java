package org.gradle.test.performancenull_426;

import static org.junit.Assert.*;

public class Testnull_42598 {
    private final Productionnull_42598 production = new Productionnull_42598("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}