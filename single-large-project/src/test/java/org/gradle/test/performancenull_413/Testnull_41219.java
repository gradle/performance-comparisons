package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41219 {
    private final Productionnull_41219 production = new Productionnull_41219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}