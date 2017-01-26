package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11089 {
    private final Productionnull_11089 production = new Productionnull_11089("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}