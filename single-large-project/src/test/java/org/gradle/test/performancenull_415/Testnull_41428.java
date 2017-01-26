package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41428 {
    private final Productionnull_41428 production = new Productionnull_41428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}