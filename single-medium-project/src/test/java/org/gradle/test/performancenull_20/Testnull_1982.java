package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1982 {
    private final Productionnull_1982 production = new Productionnull_1982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}