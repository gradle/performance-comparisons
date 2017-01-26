package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2398 {
    private final Productionnull_2398 production = new Productionnull_2398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}