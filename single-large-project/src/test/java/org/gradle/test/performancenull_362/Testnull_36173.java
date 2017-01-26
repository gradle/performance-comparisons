package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36173 {
    private final Productionnull_36173 production = new Productionnull_36173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}