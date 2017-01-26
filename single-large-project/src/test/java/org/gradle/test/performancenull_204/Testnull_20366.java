package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20366 {
    private final Productionnull_20366 production = new Productionnull_20366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}