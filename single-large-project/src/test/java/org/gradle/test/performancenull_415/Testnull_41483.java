package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41483 {
    private final Productionnull_41483 production = new Productionnull_41483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}