package org.gradle.test.performancenull_424;

import static org.junit.Assert.*;

public class Testnull_42395 {
    private final Productionnull_42395 production = new Productionnull_42395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}