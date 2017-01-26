package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41433 {
    private final Productionnull_41433 production = new Productionnull_41433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}