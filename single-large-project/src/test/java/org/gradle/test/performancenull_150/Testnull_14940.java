package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14940 {
    private final Productionnull_14940 production = new Productionnull_14940("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}