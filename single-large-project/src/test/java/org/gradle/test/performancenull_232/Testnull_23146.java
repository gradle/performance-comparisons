package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23146 {
    private final Productionnull_23146 production = new Productionnull_23146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}