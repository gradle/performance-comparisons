package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41451 {
    private final Productionnull_41451 production = new Productionnull_41451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}