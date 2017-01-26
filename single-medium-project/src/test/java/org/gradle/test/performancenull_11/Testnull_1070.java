package org.gradle.test.performancenull_11;

import static org.junit.Assert.*;

public class Testnull_1070 {
    private final Productionnull_1070 production = new Productionnull_1070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}