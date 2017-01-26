package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41441 {
    private final Productionnull_41441 production = new Productionnull_41441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}