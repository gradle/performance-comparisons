package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48471 {
    private final Productionnull_48471 production = new Productionnull_48471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}