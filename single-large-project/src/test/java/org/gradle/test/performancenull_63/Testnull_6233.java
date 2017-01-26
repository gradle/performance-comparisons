package org.gradle.test.performancenull_63;

import static org.junit.Assert.*;

public class Testnull_6233 {
    private final Productionnull_6233 production = new Productionnull_6233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}