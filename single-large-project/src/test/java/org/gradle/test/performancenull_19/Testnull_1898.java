package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1898 {
    private final Productionnull_1898 production = new Productionnull_1898("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}