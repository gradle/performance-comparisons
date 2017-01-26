package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24978 {
    private final Productionnull_24978 production = new Productionnull_24978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}