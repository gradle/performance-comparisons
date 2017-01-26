package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41421 {
    private final Productionnull_41421 production = new Productionnull_41421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}