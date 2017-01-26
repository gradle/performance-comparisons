package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41455 {
    private final Productionnull_41455 production = new Productionnull_41455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}