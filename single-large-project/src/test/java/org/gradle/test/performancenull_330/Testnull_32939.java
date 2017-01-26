package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32939 {
    private final Productionnull_32939 production = new Productionnull_32939("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}