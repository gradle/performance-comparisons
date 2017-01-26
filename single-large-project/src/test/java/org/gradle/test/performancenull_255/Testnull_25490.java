package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25490 {
    private final Productionnull_25490 production = new Productionnull_25490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}