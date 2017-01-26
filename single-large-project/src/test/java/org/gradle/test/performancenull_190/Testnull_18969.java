package org.gradle.test.performancenull_190;

import static org.junit.Assert.*;

public class Testnull_18969 {
    private final Productionnull_18969 production = new Productionnull_18969("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}