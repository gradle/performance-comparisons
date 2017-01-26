package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41403 {
    private final Productionnull_41403 production = new Productionnull_41403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}