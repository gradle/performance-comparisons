package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20623 {
    private final Productionnull_20623 production = new Productionnull_20623("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}