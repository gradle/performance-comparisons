package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41493 {
    private final Productionnull_41493 production = new Productionnull_41493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}