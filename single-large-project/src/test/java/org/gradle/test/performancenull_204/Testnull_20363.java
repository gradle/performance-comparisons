package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20363 {
    private final Productionnull_20363 production = new Productionnull_20363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}