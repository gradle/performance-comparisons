package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4144 {
    private final Productionnull_4144 production = new Productionnull_4144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}