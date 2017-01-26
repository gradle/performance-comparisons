package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19173 {
    private final Productionnull_19173 production = new Productionnull_19173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}