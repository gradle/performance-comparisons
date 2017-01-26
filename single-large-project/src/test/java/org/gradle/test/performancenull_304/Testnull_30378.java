package org.gradle.test.performancenull_304;

import static org.junit.Assert.*;

public class Testnull_30378 {
    private final Productionnull_30378 production = new Productionnull_30378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}