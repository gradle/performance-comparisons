package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20309 {
    private final Productionnull_20309 production = new Productionnull_20309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}