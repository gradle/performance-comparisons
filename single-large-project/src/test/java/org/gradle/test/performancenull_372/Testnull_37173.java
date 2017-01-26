package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37173 {
    private final Productionnull_37173 production = new Productionnull_37173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}