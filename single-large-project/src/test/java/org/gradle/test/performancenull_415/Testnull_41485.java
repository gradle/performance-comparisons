package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41485 {
    private final Productionnull_41485 production = new Productionnull_41485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}