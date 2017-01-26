package org.gradle.test.performancenull_342;

import static org.junit.Assert.*;

public class Testnull_34101 {
    private final Productionnull_34101 production = new Productionnull_34101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}