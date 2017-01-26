package org.gradle.test.performancenull_170;

import static org.junit.Assert.*;

public class Testnull_16963 {
    private final Productionnull_16963 production = new Productionnull_16963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}