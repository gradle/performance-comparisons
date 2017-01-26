package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6372 {
    private final Productionnull_6372 production = new Productionnull_6372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}