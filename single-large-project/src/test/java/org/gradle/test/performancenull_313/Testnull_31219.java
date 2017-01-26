package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31219 {
    private final Productionnull_31219 production = new Productionnull_31219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}