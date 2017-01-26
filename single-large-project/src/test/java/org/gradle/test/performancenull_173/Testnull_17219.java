package org.gradle.test.performancenull_173;

import static org.junit.Assert.*;

public class Testnull_17219 {
    private final Productionnull_17219 production = new Productionnull_17219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}