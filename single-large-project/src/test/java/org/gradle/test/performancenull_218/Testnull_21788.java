package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21788 {
    private final Productionnull_21788 production = new Productionnull_21788("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}