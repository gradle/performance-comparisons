package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2438 {
    private final Productionnull_2438 production = new Productionnull_2438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}