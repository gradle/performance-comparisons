package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6383 {
    private final Productionnull_6383 production = new Productionnull_6383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}