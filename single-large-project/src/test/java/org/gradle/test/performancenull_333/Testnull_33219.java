package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33219 {
    private final Productionnull_33219 production = new Productionnull_33219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}