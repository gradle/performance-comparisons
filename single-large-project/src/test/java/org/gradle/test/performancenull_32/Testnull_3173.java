package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3173 {
    private final Productionnull_3173 production = new Productionnull_3173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}