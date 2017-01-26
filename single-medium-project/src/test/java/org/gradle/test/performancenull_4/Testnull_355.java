package org.gradle.test.performancenull_4;

import static org.junit.Assert.*;

public class Testnull_355 {
    private final Productionnull_355 production = new Productionnull_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}