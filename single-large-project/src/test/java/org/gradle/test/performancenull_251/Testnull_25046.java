package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25046 {
    private final Productionnull_25046 production = new Productionnull_25046("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}