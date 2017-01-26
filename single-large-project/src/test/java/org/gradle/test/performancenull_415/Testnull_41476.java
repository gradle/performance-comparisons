package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41476 {
    private final Productionnull_41476 production = new Productionnull_41476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}