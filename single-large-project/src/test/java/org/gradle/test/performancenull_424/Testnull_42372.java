package org.gradle.test.performancenull_424;

import static org.junit.Assert.*;

public class Testnull_42372 {
    private final Productionnull_42372 production = new Productionnull_42372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}