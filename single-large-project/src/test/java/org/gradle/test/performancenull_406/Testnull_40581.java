package org.gradle.test.performancenull_406;

import static org.junit.Assert.*;

public class Testnull_40581 {
    private final Productionnull_40581 production = new Productionnull_40581("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}