package org.gradle.test.performancenull_323;

import static org.junit.Assert.*;

public class Testnull_32221 {
    private final Productionnull_32221 production = new Productionnull_32221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}