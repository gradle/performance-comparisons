package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2462 {
    private final Productionnull_2462 production = new Productionnull_2462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}