package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18458 {
    private final Productionnull_18458 production = new Productionnull_18458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}