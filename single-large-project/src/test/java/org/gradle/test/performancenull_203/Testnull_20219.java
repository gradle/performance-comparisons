package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20219 {
    private final Productionnull_20219 production = new Productionnull_20219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}