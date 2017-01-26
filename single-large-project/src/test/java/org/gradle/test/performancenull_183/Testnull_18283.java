package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18283 {
    private final Productionnull_18283 production = new Productionnull_18283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}