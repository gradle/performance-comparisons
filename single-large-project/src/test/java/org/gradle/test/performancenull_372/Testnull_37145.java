package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37145 {
    private final Productionnull_37145 production = new Productionnull_37145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}