package org.gradle.test.performancenull_161;

import static org.junit.Assert.*;

public class Testnull_16073 {
    private final Productionnull_16073 production = new Productionnull_16073("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}