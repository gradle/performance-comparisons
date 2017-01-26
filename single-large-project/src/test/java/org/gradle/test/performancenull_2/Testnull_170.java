package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_170 {
    private final Productionnull_170 production = new Productionnull_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}