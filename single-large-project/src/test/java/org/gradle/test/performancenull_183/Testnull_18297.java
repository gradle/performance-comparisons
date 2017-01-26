package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18297 {
    private final Productionnull_18297 production = new Productionnull_18297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}