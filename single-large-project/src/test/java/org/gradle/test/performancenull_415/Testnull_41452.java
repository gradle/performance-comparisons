package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41452 {
    private final Productionnull_41452 production = new Productionnull_41452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}