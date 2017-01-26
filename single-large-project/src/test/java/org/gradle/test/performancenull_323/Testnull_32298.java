package org.gradle.test.performancenull_323;

import static org.junit.Assert.*;

public class Testnull_32298 {
    private final Productionnull_32298 production = new Productionnull_32298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}