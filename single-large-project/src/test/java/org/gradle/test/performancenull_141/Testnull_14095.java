package org.gradle.test.performancenull_141;

import static org.junit.Assert.*;

public class Testnull_14095 {
    private final Productionnull_14095 production = new Productionnull_14095("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}