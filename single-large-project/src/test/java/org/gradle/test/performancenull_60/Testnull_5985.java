package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5985 {
    private final Productionnull_5985 production = new Productionnull_5985("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}