package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24135 {
    private final Productionnull_24135 production = new Productionnull_24135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}