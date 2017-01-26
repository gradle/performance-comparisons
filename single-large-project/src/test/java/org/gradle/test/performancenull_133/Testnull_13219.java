package org.gradle.test.performancenull_133;

import static org.junit.Assert.*;

public class Testnull_13219 {
    private final Productionnull_13219 production = new Productionnull_13219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}