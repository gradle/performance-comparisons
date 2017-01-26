package org.gradle.test.performancenull_322;

import static org.junit.Assert.*;

public class Testnull_32173 {
    private final Productionnull_32173 production = new Productionnull_32173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}