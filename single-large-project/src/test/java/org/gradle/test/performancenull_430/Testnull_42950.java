package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42950 {
    private final Productionnull_42950 production = new Productionnull_42950("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}