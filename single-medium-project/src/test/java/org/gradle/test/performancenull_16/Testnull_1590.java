package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1590 {
    private final Productionnull_1590 production = new Productionnull_1590("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}