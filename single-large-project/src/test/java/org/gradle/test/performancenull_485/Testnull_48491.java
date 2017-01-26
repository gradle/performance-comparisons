package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48491 {
    private final Productionnull_48491 production = new Productionnull_48491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}