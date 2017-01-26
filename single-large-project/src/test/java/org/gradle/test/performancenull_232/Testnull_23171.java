package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23171 {
    private final Productionnull_23171 production = new Productionnull_23171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}