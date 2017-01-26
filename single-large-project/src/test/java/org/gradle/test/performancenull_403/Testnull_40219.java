package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40219 {
    private final Productionnull_40219 production = new Productionnull_40219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}