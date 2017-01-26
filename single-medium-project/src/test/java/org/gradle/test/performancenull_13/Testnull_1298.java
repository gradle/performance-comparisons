package org.gradle.test.performancenull_13;

import static org.junit.Assert.*;

public class Testnull_1298 {
    private final Productionnull_1298 production = new Productionnull_1298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}