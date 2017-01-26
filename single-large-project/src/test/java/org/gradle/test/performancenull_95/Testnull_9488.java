package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9488 {
    private final Productionnull_9488 production = new Productionnull_9488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}