package org.gradle.test.performancenull_1;

import static org.junit.Assert.*;

public class Testnull_13 {
    private final Productionnull_13 production = new Productionnull_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}