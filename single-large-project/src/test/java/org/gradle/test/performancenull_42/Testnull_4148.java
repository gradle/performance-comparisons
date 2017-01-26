package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4148 {
    private final Productionnull_4148 production = new Productionnull_4148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}