package org.gradle.test.performancenull_247;

import static org.junit.Assert.*;

public class Testnull_24602 {
    private final Productionnull_24602 production = new Productionnull_24602("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}