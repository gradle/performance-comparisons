package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7985 {
    private final Productionnull_7985 production = new Productionnull_7985("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}