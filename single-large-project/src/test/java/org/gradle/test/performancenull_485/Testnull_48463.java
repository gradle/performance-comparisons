package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48463 {
    private final Productionnull_48463 production = new Productionnull_48463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}