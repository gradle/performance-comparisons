package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5949 {
    private final Productionnull_5949 production = new Productionnull_5949("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}