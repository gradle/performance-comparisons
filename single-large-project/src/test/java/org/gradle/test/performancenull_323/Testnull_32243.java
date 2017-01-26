package org.gradle.test.performancenull_323;

import static org.junit.Assert.*;

public class Testnull_32243 {
    private final Productionnull_32243 production = new Productionnull_32243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}