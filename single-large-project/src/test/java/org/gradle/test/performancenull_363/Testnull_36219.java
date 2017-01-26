package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36219 {
    private final Productionnull_36219 production = new Productionnull_36219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}