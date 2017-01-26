package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4835 {
    private final Productionnull_4835 production = new Productionnull_4835("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}