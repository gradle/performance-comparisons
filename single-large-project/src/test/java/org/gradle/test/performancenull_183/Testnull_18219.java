package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18219 {
    private final Productionnull_18219 production = new Productionnull_18219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}