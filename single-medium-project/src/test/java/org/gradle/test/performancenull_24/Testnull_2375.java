package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2375 {
    private final Productionnull_2375 production = new Productionnull_2375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}