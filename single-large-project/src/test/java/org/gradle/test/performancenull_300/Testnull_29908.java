package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29908 {
    private final Productionnull_29908 production = new Productionnull_29908("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}