package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11097 {
    private final Productionnull_11097 production = new Productionnull_11097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}