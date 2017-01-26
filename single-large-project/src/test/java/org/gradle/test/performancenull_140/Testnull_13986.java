package org.gradle.test.performancenull_140;

import static org.junit.Assert.*;

public class Testnull_13986 {
    private final Productionnull_13986 production = new Productionnull_13986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}