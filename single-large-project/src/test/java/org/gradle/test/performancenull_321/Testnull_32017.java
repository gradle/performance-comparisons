package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32017 {
    private final Productionnull_32017 production = new Productionnull_32017("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}