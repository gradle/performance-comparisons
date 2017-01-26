package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3179 {
    private final Productionnull_3179 production = new Productionnull_3179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}