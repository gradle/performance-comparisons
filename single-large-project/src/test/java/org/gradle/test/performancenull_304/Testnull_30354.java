package org.gradle.test.performancenull_304;

import static org.junit.Assert.*;

public class Testnull_30354 {
    private final Productionnull_30354 production = new Productionnull_30354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}