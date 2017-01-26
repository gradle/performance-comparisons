package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28428 {
    private final Productionnull_28428 production = new Productionnull_28428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}