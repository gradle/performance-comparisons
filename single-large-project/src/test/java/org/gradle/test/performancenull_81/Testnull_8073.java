package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8073 {
    private final Productionnull_8073 production = new Productionnull_8073("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}