package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2372 {
    private final Productionnull_2372 production = new Productionnull_2372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}