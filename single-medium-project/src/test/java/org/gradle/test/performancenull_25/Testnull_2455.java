package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2455 {
    private final Productionnull_2455 production = new Productionnull_2455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}