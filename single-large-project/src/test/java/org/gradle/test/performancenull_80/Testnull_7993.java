package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7993 {
    private final Productionnull_7993 production = new Productionnull_7993("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}