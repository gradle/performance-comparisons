package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2471 {
    private final Productionnull_2471 production = new Productionnull_2471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}