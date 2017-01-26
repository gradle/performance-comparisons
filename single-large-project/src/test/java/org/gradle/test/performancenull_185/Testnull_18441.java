package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18441 {
    private final Productionnull_18441 production = new Productionnull_18441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}