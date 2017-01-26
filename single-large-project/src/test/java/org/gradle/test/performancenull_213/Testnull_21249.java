package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21249 {
    private final Productionnull_21249 production = new Productionnull_21249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}