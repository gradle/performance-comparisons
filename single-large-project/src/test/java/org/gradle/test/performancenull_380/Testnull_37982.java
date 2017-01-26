package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37982 {
    private final Productionnull_37982 production = new Productionnull_37982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}