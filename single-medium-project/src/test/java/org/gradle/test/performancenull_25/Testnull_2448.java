package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2448 {
    private final Productionnull_2448 production = new Productionnull_2448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}