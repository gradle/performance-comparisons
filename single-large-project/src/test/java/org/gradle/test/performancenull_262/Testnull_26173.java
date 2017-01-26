package org.gradle.test.performancenull_262;

import static org.junit.Assert.*;

public class Testnull_26173 {
    private final Productionnull_26173 production = new Productionnull_26173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}