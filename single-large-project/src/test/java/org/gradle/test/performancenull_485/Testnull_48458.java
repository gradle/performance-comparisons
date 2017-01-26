package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48458 {
    private final Productionnull_48458 production = new Productionnull_48458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}