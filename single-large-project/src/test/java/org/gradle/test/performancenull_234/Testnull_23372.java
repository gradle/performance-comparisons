package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23372 {
    private final Productionnull_23372 production = new Productionnull_23372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}