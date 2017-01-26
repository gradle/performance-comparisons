package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41438 {
    private final Productionnull_41438 production = new Productionnull_41438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}