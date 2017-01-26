package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4150 {
    private final Productionnull_4150 production = new Productionnull_4150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}