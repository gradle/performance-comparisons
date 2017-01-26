package org.gradle.test.performancenull_304;

import static org.junit.Assert.*;

public class Testnull_30382 {
    private final Productionnull_30382 production = new Productionnull_30382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}