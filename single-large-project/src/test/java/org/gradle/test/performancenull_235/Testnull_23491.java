package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23491 {
    private final Productionnull_23491 production = new Productionnull_23491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}