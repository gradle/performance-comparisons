package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21982 {
    private final Productionnull_21982 production = new Productionnull_21982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}