package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11068 {
    private final Productionnull_11068 production = new Productionnull_11068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}