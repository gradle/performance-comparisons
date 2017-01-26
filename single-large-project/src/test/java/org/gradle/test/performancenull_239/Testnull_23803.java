package org.gradle.test.performancenull_239;

import static org.junit.Assert.*;

public class Testnull_23803 {
    private final Productionnull_23803 production = new Productionnull_23803("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}