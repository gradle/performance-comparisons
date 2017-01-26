package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42939 {
    private final Productionnull_42939 production = new Productionnull_42939("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}