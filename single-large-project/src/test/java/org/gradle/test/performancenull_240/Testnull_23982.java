package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23982 {
    private final Productionnull_23982 production = new Productionnull_23982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}