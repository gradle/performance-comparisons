package org.gradle.test.performancenull_190;

import static org.junit.Assert.*;

public class Testnull_18933 {
    private final Productionnull_18933 production = new Productionnull_18933("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}