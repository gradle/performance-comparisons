package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25031 {
    private final Productionnull_25031 production = new Productionnull_25031("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}