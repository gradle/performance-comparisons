package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4939 {
    private final Productionnull_4939 production = new Productionnull_4939("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}