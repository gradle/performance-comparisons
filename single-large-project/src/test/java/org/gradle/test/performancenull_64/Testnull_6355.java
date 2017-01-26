package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6355 {
    private final Productionnull_6355 production = new Productionnull_6355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}