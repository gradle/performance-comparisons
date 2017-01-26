package org.gradle.test.performancenull_52;

import static org.junit.Assert.*;

public class Testnull_5170 {
    private final Productionnull_5170 production = new Productionnull_5170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}