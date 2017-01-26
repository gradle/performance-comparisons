package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12949 {
    private final Productionnull_12949 production = new Productionnull_12949("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}