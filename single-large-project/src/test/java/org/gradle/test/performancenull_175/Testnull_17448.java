package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17448 {
    private final Productionnull_17448 production = new Productionnull_17448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}