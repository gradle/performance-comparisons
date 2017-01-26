package org.gradle.test.performancenull_376;

import static org.junit.Assert.*;

public class Testnull_37598 {
    private final Productionnull_37598 production = new Productionnull_37598("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}