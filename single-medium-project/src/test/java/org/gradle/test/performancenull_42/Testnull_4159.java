package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4159 {
    private final Productionnull_4159 production = new Productionnull_4159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}