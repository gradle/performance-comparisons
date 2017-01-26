package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21898 {
    private final Productionnull_21898 production = new Productionnull_21898("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}