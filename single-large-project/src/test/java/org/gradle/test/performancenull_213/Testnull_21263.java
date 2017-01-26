package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21263 {
    private final Productionnull_21263 production = new Productionnull_21263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}