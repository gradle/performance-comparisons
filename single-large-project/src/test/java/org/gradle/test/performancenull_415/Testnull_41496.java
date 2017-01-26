package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41496 {
    private final Productionnull_41496 production = new Productionnull_41496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}