package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3170 {
    private final Productionnull_3170 production = new Productionnull_3170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}