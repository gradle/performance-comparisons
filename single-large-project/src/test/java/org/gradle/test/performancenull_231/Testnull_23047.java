package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23047 {
    private final Productionnull_23047 production = new Productionnull_23047("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}