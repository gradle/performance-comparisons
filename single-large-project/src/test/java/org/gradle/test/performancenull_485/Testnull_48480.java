package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48480 {
    private final Productionnull_48480 production = new Productionnull_48480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}