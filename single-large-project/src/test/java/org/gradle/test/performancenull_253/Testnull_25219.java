package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25219 {
    private final Productionnull_25219 production = new Productionnull_25219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}