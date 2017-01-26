package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40033 {
    private final Productionnull_40033 production = new Productionnull_40033("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}