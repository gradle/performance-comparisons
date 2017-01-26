package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14982 {
    private final Productionnull_14982 production = new Productionnull_14982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}