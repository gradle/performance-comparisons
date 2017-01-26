package org.gradle.test.performancenull_436;

import static org.junit.Assert.*;

public class Testnull_43572 {
    private final Productionnull_43572 production = new Productionnull_43572("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}