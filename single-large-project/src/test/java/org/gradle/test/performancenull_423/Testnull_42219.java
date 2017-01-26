package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42219 {
    private final Productionnull_42219 production = new Productionnull_42219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}