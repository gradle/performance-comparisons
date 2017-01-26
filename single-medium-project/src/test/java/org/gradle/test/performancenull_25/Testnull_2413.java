package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2413 {
    private final Productionnull_2413 production = new Productionnull_2413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}