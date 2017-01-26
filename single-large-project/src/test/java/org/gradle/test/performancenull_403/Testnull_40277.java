package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40277 {
    private final Productionnull_40277 production = new Productionnull_40277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}