package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24939 {
    private final Productionnull_24939 production = new Productionnull_24939("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}