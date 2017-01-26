package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48496 {
    private final Productionnull_48496 production = new Productionnull_48496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}