package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21063 {
    private final Productionnull_21063 production = new Productionnull_21063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}