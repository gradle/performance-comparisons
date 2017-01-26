package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48462 {
    private final Productionnull_48462 production = new Productionnull_48462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}