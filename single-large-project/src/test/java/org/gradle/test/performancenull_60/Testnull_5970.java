package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5970 {
    private final Productionnull_5970 production = new Productionnull_5970("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}