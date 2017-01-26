package org.gradle.test.performancenull_248;

import static org.junit.Assert.*;

public class Testnull_24706 {
    private final Productionnull_24706 production = new Productionnull_24706("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}