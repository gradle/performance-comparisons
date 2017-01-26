package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43967 {
    private final Productionnull_43967 production = new Productionnull_43967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}