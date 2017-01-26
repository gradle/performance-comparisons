package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41415 {
    private final Productionnull_41415 production = new Productionnull_41415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}