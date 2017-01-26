package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40101 {
    private final Productionnull_40101 production = new Productionnull_40101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}